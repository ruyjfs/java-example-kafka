package br.com.itau.workercarrinholake.services;

import br.com.itau.workercarrinholake.templates.UserTemplate;
import com.github.ruyjfs.examplejavakafka.services.KafkaProducerService;
import org.apache.avro.generic.GenericRecord;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.kafka.core.KafkaTemplate;

//@SpringBootTest
//@RunWith(MockitoJUnitRunner.class)
//@Slf4j
public class KafkaConsumerServiceTest {
//
//    KafkaProducerService service;
//
//    @Mock
//    private KafkaTemplate<String, GenericRecord> kafkaTemplate;
//
//
//    private final UserTemplate userTemplate = UserTemplate.getInstance();
//
//    @Test
//    public void testIsValidSystur() throws Exception {
//        service.create(userTemplate.generate());
//        Mockito.when(service.create(userTemplate.generate())).thenReturn(true);
//        ;
//
//
//
////
////        attributeService.isValid(attribute);
//        // assertEquals(attribute, attributeRetorno);
//    }
}
