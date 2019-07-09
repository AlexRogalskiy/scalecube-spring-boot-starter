package org.springframework.boot.test.scalecube.example;

import io.scalecube.services.annotations.Service;
import io.scalecube.services.annotations.ServiceMethod;
import reactor.core.publisher.Flux;

@Service
public interface ExternalScalecubeService2 {

  @ServiceMethod
  Flux<String> lower(Flux<String> input);

}
