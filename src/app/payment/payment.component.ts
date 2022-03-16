import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  service: any;
  productlist: any;

  constructor() { }

  ngOnInit() {
    this.service.getallproducts().subscribe((res: any)=>{this.productlist=res})
  }

}
