import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditDailogBarComponent } from './edit-dailog-bar.component';

describe('EditDailogBarComponent', () => {
  let component: EditDailogBarComponent;
  let fixture: ComponentFixture<EditDailogBarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditDailogBarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditDailogBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
