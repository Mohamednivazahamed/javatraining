import { Component, OnInit } from '@angular/core';
import { product } from '../../model/product';
import { ProductService } from '../../services/product.service';
@Component({
  selector: 'app-fetch',
  templateUrl: './fetch.component.html',
  styleUrl: './fetch.component.css'
})
export class FetchComponent {
  products :product[] =[]
  constructor(private service:ProductService)
{

}
ngOnInit(): void{
  console.log("from onInit() ...");
  this.products =this.getProducts();
 }
 
getProducts() :any 
{
  this.service.getProducts().subscribe((products) => {
    console.log(products);
    this.products =products;
  })
}
}
