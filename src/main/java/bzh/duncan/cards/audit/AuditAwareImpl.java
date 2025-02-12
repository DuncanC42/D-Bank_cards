package bzh.duncan.cards.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditorAwareImpl")
public class AuditAwareImpl implements AuditorAware {

    /**
     * @return
     */
    @Override
    public Optional getCurrentAuditor() {
        return Optional.of("Duncan");
    }
}
