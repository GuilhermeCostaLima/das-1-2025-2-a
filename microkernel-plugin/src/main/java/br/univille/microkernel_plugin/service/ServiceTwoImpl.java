package br.univille.microkernel_plugin.service;

import org.springframework.stereotype.service;
import org.springframework.http.HttpStatus;
import br.univille.microkernel_interface.service.DefaultService;

@Service
public class ServiceTwoImpl 
    implements DefaultService{

    @Override
    public HttpStatus doWork(HashMap<String, String> params) {
        System.out.println("Service TWO: " + params);
        return HttpStatus.INTERNAL_SERVER_ERROR;
        
    }

}