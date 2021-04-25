import { TestBed, inject } from '@angular/core/testing';

import { CardsupdateServiceService } from './cardsupdate-service.service';

describe('CardsupdateServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CardsupdateServiceService]
    });
  });

  it('should be created', inject([CardsupdateServiceService], (service: CardsupdateServiceService) => {
    expect(service).toBeTruthy();
  }));
});
