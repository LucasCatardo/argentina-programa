import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  public imgUSAL: string = "assets/images/USAL.jpg";
  public imgAgustiniano: string = "assets/images/Agustiniano.jpg";

  constructor() { }

  ngOnInit(): void {
  }

}
