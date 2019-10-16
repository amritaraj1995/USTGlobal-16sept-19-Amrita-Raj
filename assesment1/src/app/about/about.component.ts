import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
Movies=[{"Title":"Guardians of the Galaxy Vol. 2",
"Poster":"https://m.media-amazon.com/images/M/MV5BN2MwNjJlODAtMTc1MS00NjkwLTg2NDMtYzFjZmU2MGM1YWUwXkEyXkFqcGdeQXVyMTYzMDM0NTU@._V1_SX300.jpg",
},
{
  "Title":"Milana",
  "Poster":"https://m.media-amazon.com/images/M/MV5BZGI5YTFhN2ItMjhlOC00NzlmLTgzM2EtZWEyNmY5NmMxYWNmXkEyXkFqcGdeQXVyNTE0NDY5Njc@._V1_SX300.jpg",
},
{
  "Title":"Madhura Milana",
  "Poster":"N/A",
},
{
  "Title":"Ae Milana Juga Jugara",
  "Poster":"N/A",

}]
  constructor() { }

  ngOnInit() {
  }

}
