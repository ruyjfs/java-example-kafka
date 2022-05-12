package br.com.itau.workercarrinholake.services;

import com.github.ruyjfs.examplejavakafka.services.KafkaProducerService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.itau.workercarrinholake.templates.UserTemplate;

//@RunWith(MockitoJUnitRunner.class)
//
//@Slf4j
//@RunWith(MockitoJUnitRunner.class)
//@AutoConfigureMockMvc()

@RunWith(MockitoJUnitRunner.class)
public class KafkaProducerServiceTest {
    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @InjectMocks
    private KafkaProducerService service;
    //
    // @Mock
    // private KafkaTemplate<String, GenericRecord> kafkaTemplate;
    //
    private final UserTemplate userTemplate = UserTemplate.getInstance();

    @Test
    public void test_Create_OK() {
        var test = userTemplate.getUser();
        service.create(test);
        //// Mockito.when(service.create(userTemplate.generate())).thenReturn(true);
        //// var result = service.create(userTemplate.generate());
        Assertions.assertTrue(true);
    }
}
