import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {

  public imgINTI: string = "assets/images/INTI.png";
  public imgDigitalHouse: string = "assets/images/DigitalHouse.png";
  public imgEsur: string = "assets/images/Esur.png";

  constructor() { }

  ngOnInit(): void {
  }

}
