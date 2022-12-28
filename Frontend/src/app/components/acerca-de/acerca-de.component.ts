import { Component, OnInit } from '@angular/core';
import { Users } from 'src/app/models/users.model';
import { UsersService } from 'src/app/service/users.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {

  public imgCV: string = "assets/images/CV.jpg";
  user: Users = new Users("", "", "");

  constructor(public usersService: UsersService) { }

  ngOnInit(): void {
    this.usersService.getUser().subscribe(data => { this.user = data });
  }

}
