package br.com.dantas.hrworker.servicies;

import br.com.dantas.hrworker.entities.Worker;
import br.com.dantas.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository repository;

    public List<Worker> findAll() {
        return repository.findAll();
    }

    public Worker findById(Long id) {
        final var obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", tipo, " + Worker.class.getName()));
    }
}
