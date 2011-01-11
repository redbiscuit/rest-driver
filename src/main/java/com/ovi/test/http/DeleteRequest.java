package com.ovi.test.http;

public class DeleteRequest extends BaseRequest {

	public DeleteRequest(final String url) {
		super(url, new Header[0]);
	}

	@Override
	public String toString() {
		return "DELETE " + super.toString();
	}

}
