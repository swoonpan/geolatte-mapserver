package org.geolatte.mapserver;

import org.geolatte.mapserver.tilemap.DynamicTileMapLayer;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by Karel Maesen, Geovise BVBA on 25/07/2018.
 */
public class TestConfiguration {

    @Test
    public void testSuccessfullLayerRegistryConfiguration(){

        LayerRegistry registry = ServiceRegistry.getInstance().layerRegistry();
        Layer vkb = registry.getLayer("vkb").get();
        assertThat( vkb , instanceOf(DynamicTileMapLayer.class));
    }

}