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

package co.paulozan.slack.contract;

import co.paulozan.slack.event.ChatResponse;
import com.netflix.hystrix.HystrixCommand;
import feign.QueryMap;
import feign.RequestLine;
import java.util.Map;

public interface Chat {

  @RequestLine("POST /api/chat.postMessage")
  HystrixCommand<ChatResponse> postMessage(@QueryMap Map<String,Object> param);

  @RequestLine("POST /api/chat.delete")
  HystrixCommand<ChatResponse> delete(@QueryMap Map<String,Object> param);


}
