import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Book1FormComponent } from './book1-form.component';

describe('Book1FormComponent', () => {
  let component: Book1FormComponent;
  let fixture: ComponentFixture<Book1FormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Book1FormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Book1FormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
