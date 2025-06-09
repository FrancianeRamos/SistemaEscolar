package br.com.fatecads.fatecads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;
import br.com.fatecads.fatecads.service.AlunoService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;


import br.com.fatecads.fatecads.controller.AlunoController;
import br.com.fatecads.fatecads.entity.Aluno;

@WebMvcTest(AlunoController.class)
public class AlunoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private AlunoService alunoService; 
    
    @Test 
    void testSalvarAluno() throws Exception {
        Aluno aluno = new Aluno();
        aluno.setNomeAluno("João da Silva");
        aluno.setEndAluno("Rua A, 123");
        aluno.setTelAluno("11987654321");
        aluno.setRaAluno(123456);

        mockMvc.perform(post("/alunos/salvar").flashAttr("aluno", aluno))
            .andExpect(status().is3xxRedirection())
            .andExpect(redirectedUrl("/alunos/listar"));
    }
}
        
    
