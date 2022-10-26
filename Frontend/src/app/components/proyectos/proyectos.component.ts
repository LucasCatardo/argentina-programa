import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent implements OnInit {

  public imgGithub: string = "assets/images/Github.png";
  public imgEsur: string = "assets/images/Esur.png";

  constructor() { }

  ngOnInit(): void {
  }

}
