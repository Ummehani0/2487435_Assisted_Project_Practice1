import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  items: any[];
  cartService: any;
  
  constructor(private service:CartService,private router:Router) { }

  ngOnInit() {
    this.items = this.service.getItems();
  }
   addTopayment(product: any) {
     this.cartService.addTopayment(cart);
  
     this.router.navigate['/payment']
   }
  payment(){
    alert('Payment Successfully done👍')
    //this.router.navigate(['/payment'])
  }

}


function cart(cart: any) {
  throw new Error('Function not implemented.');
}

