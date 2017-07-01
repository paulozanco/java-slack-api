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

import co.paulozan.slack.client.ChannelsClient;
import co.paulozan.slack.client.ChatClient;
import co.paulozan.slack.client.IMClient;
import co.paulozan.slack.event.ChannelsResponse;
import co.paulozan.slack.event.IMResponse;

public class App {

  public static void main(String[] args) {
    try {

      IMResponse response = App.imClientHistory();
      response.getMessages().forEach(message -> {
        try {
          System.out.println(message);
          App.chatClientDeleteMessage("D5Z5NM7GS", message.getTs());
        } catch (Exception e) {
          e.printStackTrace();
          System.exit(1);
        }
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  private static ChannelsResponse channelsClientHistory() throws Exception {
    String token = System.getenv("SLACK_USER_TOKEN");
    String channel = "C5SMF2FSB";

    return ChannelsClient.history(token, channel);
  }


  private static void chatClientDeleteMessage(String channel, String ts) throws Exception {
    String token = System.getenv("SLACK_TOKEN");
    ChatClient.delete(token, channel, ts);
  }


  private static void chatClientPostMessage() throws Exception {
    String token = System.getenv("SLACK_TOKEN");
    String channel = "C5SMF2FSB";
    String text = "Hello World";

    ChatClient.postMessage(token, channel, text);
  }

  private static IMResponse imClientHistory() throws Exception {
    String token = System.getenv("SLACK_TOKEN");
    String channel = "D5Z5NM7GS";

    return IMClient.history(token, channel);
  }

}
