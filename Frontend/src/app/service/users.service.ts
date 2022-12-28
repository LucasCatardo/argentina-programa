import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Users } from '../models/users.model';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  URL: String = "http://localhost:8080/users/";

  constructor(private http: HttpClient) { }

  public getUser(): Observable<Users> {
    return this.http.get<Users>(this.URL + "find/" + 1);
  }
}
