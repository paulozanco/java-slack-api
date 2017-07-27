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

import co.paulozan.slack.contract.Channels;
import co.paulozan.slack.event.ChannelsRequest;
import co.paulozan.slack.event.ChannelsResponse;
import rx.Observable;

public final class ChannelsClient {

  private static final Channels channels = (Channels) Builder.instance(Channels.class);

  private ChannelsClient() {
  }

  public static ChannelsResponse history(String token, String channel) throws Exception {
    ChannelsRequest.History param = ChannelsRequest.History.builder().token(token).channel(channel)
        .build();
    Observable<ChannelsResponse> observable = channels.history(param.toMap()).toObservable();
    return observable.toBlocking().single();
  }


}
