import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RichiestaPreventivoComponent } from './richiesta-preventivo.component';

describe('RichiestaPreventivoComponent', () => {
  let component: RichiestaPreventivoComponent;
  let fixture: ComponentFixture<RichiestaPreventivoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RichiestaPreventivoComponent]
    });
    fixture = TestBed.createComponent(RichiestaPreventivoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
