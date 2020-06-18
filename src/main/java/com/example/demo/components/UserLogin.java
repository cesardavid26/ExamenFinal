package com.example.demo.components;

import org.springframework.stereotype.Component;
import lombok.Data;


@Component
@Data
public class UserLogin {
    private String documento;

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
}
