import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RichiestaAppuntamentoComponent } from './richiesta-appuntamento.component';

describe('RichiestaAppuntamentoComponent', () => {
  let component: RichiestaAppuntamentoComponent;
  let fixture: ComponentFixture<RichiestaAppuntamentoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RichiestaAppuntamentoComponent]
    });
    fixture = TestBed.createComponent(RichiestaAppuntamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
