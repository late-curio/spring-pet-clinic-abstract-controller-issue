package org.springframework.samples.petclinic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.vet.Vets;
import org.springframework.web.bind.annotation.GetMapping;

public abstract class CommonController {

	@GetMapping
	public ResponseEntity<Vets> somethingUnique() {
		// Here we are returning an object of type 'Vets' rather than a collection of Vet
		// objects so it is simpler for JSon/Object mapping
		Vets vets = new Vets();
		vets.getVetList();
		return new ResponseEntity<>(vets, HttpStatus.OK);
	}

}
