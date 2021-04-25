import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LabelDailogBoxComponent } from './label-dailog-box.component';

describe('LabelDailogBoxComponent', () => {
  let component: LabelDailogBoxComponent;
  let fixture: ComponentFixture<LabelDailogBoxComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LabelDailogBoxComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LabelDailogBoxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
