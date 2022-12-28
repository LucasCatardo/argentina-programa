import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public imgLogin: string = "assets/images/Huella.jpg";

  constructor() { }

  ngOnInit(): void {
  }

}
