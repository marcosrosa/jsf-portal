package ova.common;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import ova.api.ResourceBundleMessages;


/**
 * Module specific extension of the {@link ResourceBundleMessages}.
 */
@ApplicationScoped
@Named
public class ModBMessages extends ResourceBundleMessages
{
	//~ Methods ----------------------------------------------------------------

	@Override
	protected String getBundleName()
	{
		return "modB";
	}
}
