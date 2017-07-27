/*
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 *   The full license can be found online at http://www.gnu.org/copyleft/gpl.html
 *
 */

package co.paulozan.slack.client;

import co.paulozan.slack.contract.OAuth;
import co.paulozan.slack.domain.Authentication;
import co.paulozan.slack.event.AuthenticationResponse;
import rx.Observable;

public final class OAuthClient {

  private static final OAuth oAuth = (OAuth) Builder.instance(OAuth.class);

  private OAuthClient() {
  }

  public static AuthenticationResponse access(Authentication authentication) throws Exception {
    Observable<AuthenticationResponse> observable = oAuth.access(authentication).toObservable();
    return observable.toBlocking().single();
  }
}
