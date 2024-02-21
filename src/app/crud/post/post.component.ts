import { Component } from '@angular/core';
import { product } from '../../model/product';
import { ProductService } from '../../services/product.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrl: './post.component.css'
})
export class PostComponent {
onSubmit() {
this.saveProduct();

}

  product:product = new product();
  constructor(private productservice:ProductService) {

  }

  saveProduct() :void {
    this.productservice.saveProduct(this.product).
    subscribe((data) => {
      console.log(data);
    },
    (error)=>console.log(error)
    )
  }
}

