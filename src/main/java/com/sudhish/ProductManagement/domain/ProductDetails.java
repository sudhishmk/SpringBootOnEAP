package com.sudhish.ProductManagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductDetails {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
	    private String name;
	    private String description;
	    private String price;

}
