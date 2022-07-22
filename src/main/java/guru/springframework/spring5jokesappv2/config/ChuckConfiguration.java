package guru.springframework.spring5jokesappv2.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

// @Configuration
public class ChuckConfiguration {

  // @Bean
  ChuckNorrisQuotes chuckNorrisQuotes() {
    return new ChuckNorrisQuotes();
  }
}
