package br.com.mejias.elo7.explorandomarte.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.mejias.elo7.explorandomarte.model.infra.ErroRetorno;
import br.com.mejias.elo7.explorandomarte.model.infra.NaoEncontradoException;
import br.com.mejias.elo7.explorandomarte.model.infra.NegocioException;

@ControllerAdvice
public class ExceptionConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionConfig.class);

    @ExceptionHandler(NegocioException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErroRetorno negocioException(NegocioException e) {
        LOGGER.error("Requisicao invalida: {}", e);
        return new ErroRetorno(e.getMessage());
    }

    @ExceptionHandler(NaoEncontradoException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErroRetorno naoEncontradoException(NaoEncontradoException e) {
        LOGGER.error("Requisicao nao encontrada: {}", e);
        return new ErroRetorno(e.getMessage());
    }

}
