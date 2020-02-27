package com.verizon.thomas.dronelogfile.domain;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

@MappedSuperclass  // a superclass of an entity and should have its attributes mapped into the entity
@TypeDefs({
    @TypeDef(name = "json", typeClass = JsonStringType.class),
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class EntUUID {
	
	@Id
	@org.hibernate.annotations.Type(type="pg-uuid")
	private UUID id;
	
	public EntUUID() {
        this.id = UUID.randomUUID();
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

}
