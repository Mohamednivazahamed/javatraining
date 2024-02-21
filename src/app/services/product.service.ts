import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { product } from '../model/product';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) {

   }
 
getProducts() :Observable<product[]>{
  return this.http.get<product[]>("http://localhost:9090/allproducts");
}

saveProduct(prodct: product) :Observable<Object> {
  return this.http.
  post("http://localhost:9090/addproduct",prodct);
}
}
