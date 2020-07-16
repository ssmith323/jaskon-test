package demo.jacksontest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MapperTest {

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    void test() throws JsonProcessingException {
        Obj a = mapper.readValue("{}", Obj.class);

        assertThat(a.getList()).isEqualTo(emptyList());
    }

    @Test
    void test2() throws JsonProcessingException {
        String a = mapper.writeValueAsString(Obj.builder().build());

        assertThat(a).isEqualTo("{\"list\":[]}");
    }
}

