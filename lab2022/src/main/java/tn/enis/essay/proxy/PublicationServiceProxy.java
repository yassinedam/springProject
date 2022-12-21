package tn.enis.essay.proxy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tn.enis.essay.Bean.PublicationBean;

@FeignClient(name = "PUBLICATION-SERVICE")
public interface PublicationServiceProxy {
	@GetMapping(value="/Publications/{id}")
	public PublicationBean findpubById(@PathVariable(name="id") Long id);
}
