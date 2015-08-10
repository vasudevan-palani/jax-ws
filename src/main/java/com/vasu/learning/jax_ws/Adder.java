package com.vasu.learning.jax_ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Adder {

	@WebMethod public long add(long a, long b);
}
