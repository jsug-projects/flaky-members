package jsug.flaky.members;

import java.time.Instant;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Member.class)
public class MemberEventHandler {

	@HandleBeforeCreate
	public void beforeCreate(Member member) {
		member.setCreatedAt(Instant.now());
	}
}
