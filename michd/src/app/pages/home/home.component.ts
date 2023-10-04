import { Component, OnInit } from '@angular/core';
import { NgbCarouselConfig } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  showNavigationArrows = false;
	showNavigationIndicators = false;
	images = [1, 4, 3, 5, 2, 6, 7, 8, 9, 10].map((n) => `assets/tattoo${n}.png`);

  constructor(config: NgbCarouselConfig) {
		// customize default values of carousels used by this component tree
		config.showNavigationArrows = true;
		config.showNavigationIndicators = true;
	}


  ngOnInit(): void {

    const navbarToggler = document.querySelector('.navbar-toggler') as HTMLElement;
    const navbarCollapse = document.querySelector('.navbar-collapse') as HTMLElement;

    navbarToggler.addEventListener('click', () => {
    navbarCollapse.classList.toggle('show');
    });
  }
}
