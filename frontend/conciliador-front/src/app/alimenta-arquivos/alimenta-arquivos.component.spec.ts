import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlimentaArquivosComponent } from './alimenta-arquivos.component';

describe('AlimentaArquivosComponent', () => {
  let component: AlimentaArquivosComponent;
  let fixture: ComponentFixture<AlimentaArquivosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlimentaArquivosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlimentaArquivosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
