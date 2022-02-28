import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class QuizService {
  constructor(private http: HttpClient) {}

  get(url: string) {
    return this.http.get(url);
  }

  getAll() {
    return [
      {
        id: 'data/javascript.json',
        name: 'JavaScript',
        description:
          "An JavaScript quiz to understand the concepts and to check your Knowedge about it",
        imageUrl: 'assets/images/JS.png',
      },
      {
        id: 'data/aspnet.json',
        name: 'Asp.Net',
        description:
          "An Asp.Net quiz to understand the concepts and to check your Knowedge about it",
        imageUrl: 'assets/images/ASP.png',
      },
      {
        id: 'data/csharp.json',
        name: 'C Sharp',
        description:
          "An C# quiz to understand the concepts and to check your Knowedge about it",
        imageUrl: 'assets/images/CSHARP.png',
      },
    ];
  }
}
