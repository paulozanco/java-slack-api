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

import co.paulozan.slack.contract.RTM;
import co.paulozan.slack.event.RTMResponse;
import rx.Observable;

public final class RTMClient {

  private static final RTM rtm = (RTM) Builder.instance(RTM.class);

  private RTMClient() {
  }

  public static RTMResponse connect(String token) throws Exception {
    Observable<RTMResponse> observable = rtm.connect(token).toObservable();
    return observable.toBlocking().single();
  }

}
