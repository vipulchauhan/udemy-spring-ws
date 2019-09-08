package io.vnc.ioc.services;

public class BadFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "not gonna perform well";
	}

}
