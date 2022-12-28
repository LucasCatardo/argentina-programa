import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  public imgArgProg: string = "assets/images/ArgentinaPrograma.png";
  public imgINTI: string = "assets/images/INTI.png";
  public imgLinkedin: string = "assets/images/Linkedin.png";
  public imgTwitter: string = "assets/images/Twitter.png";
  public imgInstagram: string = "assets/images/Instagram.png";
  public imgGithub: string = "assets/images/Github.png";

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  login() {
    this.router.navigate(['/login']);
  }

}
