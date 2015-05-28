package sk.anext.commons;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * <strong>Created with IntelliJ IDEA</strong><br/>
 * User: Jiri Pejsa<br/>
 * Date: 26.5.15<br/>
 * Time: 13:49<br/>
 * <p>To change this template use File | Settings | File Templates.</p>
 */
public class DummyUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return new User(username, "notUsed", true, true, true, true,
				AuthorityUtils.createAuthorityList("ROLE_USER"));
	}
}
