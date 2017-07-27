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

import co.paulozan.slack.contract.IM;
import co.paulozan.slack.event.IMRequest;
import co.paulozan.slack.event.IMResponse;
import rx.Observable;

public final class IMClient {

  private static final IM im = (IM) Builder.instance(IM.class);

  private IMClient() {
  }

  public static IMResponse history(String token,
      String channel) throws Exception {
    IMRequest.History param = IMRequest.History.builder().token(token).channel(channel).build();
    Observable<IMResponse> observable = im.history(param.toMap()).toObservable();
    return observable.toBlocking().single();
  }
}
