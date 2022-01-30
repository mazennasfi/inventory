package com.codeonce.inventory.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	@CreatedDate
	@JsonIgnore
	private Instant createdDate;

	@LastModifiedDate
	@JsonIgnore
	private Instant lastModifiedDate;

	public BaseEntity() {
		super();
	}

	public BaseEntity(final Instant createdDate, final Instant lastModifiedDate) {
		super();
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(final Instant createdDate) {
		this.createdDate = createdDate;
	}

	public Instant getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(final Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
