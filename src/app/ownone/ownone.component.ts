import { Component } from '@angular/core';

@Component({
  selector: 'app-ownone',
  templateUrl: './ownone.component.html',
  styleUrl: './ownone.component.css'
})
export class OwnoneComponent {
  qty1 : number = 20000;
  qty2 : number = 20000;
  qty3 :number =0;

  mutiliply():void{
    this.qty3 = this.qty1 * this.qty2;
  }
}
