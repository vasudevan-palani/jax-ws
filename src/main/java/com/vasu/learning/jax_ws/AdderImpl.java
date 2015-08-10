package com.vasu.learning.jax_ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.vasu.learning.jax_ws.Adder")
public class AdderImpl implements Adder {

	public long add(long a, long b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
