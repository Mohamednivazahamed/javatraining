import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OwnoneComponent } from './ownone.component';

describe('OwnoneComponent', () => {
  let component: OwnoneComponent;
  let fixture: ComponentFixture<OwnoneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [OwnoneComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(OwnoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
