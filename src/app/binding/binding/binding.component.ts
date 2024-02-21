import { Component } from '@angular/core';
import { item } from '../../model/item';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrl: './binding.component.css'
})
export class BindingComponent {
  topic = "Bindinng componnet"
  productId:number = 127676;
  description= "Apple MAC Book - retina eye";
  qty : number = 20000;
  price = 14500;
  available :string = 'green';
  notavailable : string = 'red';
  delivery : string = 'red';
  isMember = true; 
  isqtyavailable= this.qty>0;
  orderedqty :number =0;

  takeOrder():void{
    console.log(this.orderedqty + " Order(s) Placed");
  }

  products = [
    {"id":1,"name":"Licensed Frozen Hat","description":"Incidunt et magni","price":"170.00","quantity":56840},
    {"id":2,"name":"Rustic Concrete Chicken","description":"Sint libero mollitia","price":"302.00","quantity":9358},
    {"id":3,"name":"Fantastic Metal Computer","description":"In consequuntur cupiditat","price":"279.00","quantity":90316},
    {"id":4,"name":"Refined Concrete Chair","description":"Saepe nemo praesentium","price":"760.00","quantity":5899}
];

items :item[]= [
  new item(1,"Iphone 14","Smart Phone",78000,5), 
  new item(2,"samsung galxy","smart phone",10000,10),
  new item(3,"One plus11", "samrtPhone",8900,2)
]
}
