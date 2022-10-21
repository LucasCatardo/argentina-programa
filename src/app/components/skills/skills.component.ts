import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  public html: any[] = [
    {
      "name": "HTML",
      "value": 99
    },
    {
      "name": "No HTML",
      "value": 1
    }
  ];

  public js: any[] = [
    {
      "name": "JS",
      "value": 90
    },
    {
      "name": "No JS",
      "value": 10
    }
  ];

  public css: any[] = [
    {
      "name": "CSS",
      "value": 95
    },
    {
      "name": "No CSS",
      "value": 5
    }
  ];

  public bd: any[] = [
    {
      "name": "Bases de datos",
      "value": 99
    },
    {
      "name": "No Bases de datos",
      "value": 1
    }
  ];

  public net: any[] = [
    {
      "name": ".NET",
      "value": 95
    },
    {
      "name": "No .NET",
      "value": 5
    }
  ];

  public bootstrap: any[] = [
    {
      "name": "Bootstrap",
      "value": 85
    },
    {
      "name": "No Bootstrap",
      "value": 15
    }
  ];

  public dimension: [number, number] = [400, 200];

  showLegend: boolean = true;
  showLabels: boolean = true;

  public colorScheme: any[string] = {
    domain: ['#5AA454', '#E44D25']
  };

  constructor() {
   }

  ngOnInit(): void {
  }

}
